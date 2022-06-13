package com.tuling.config.inmemory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

import javax.sql.DataSource;

/**
 * 授权中心的配置
 * Created by wyb on 2019/12/20.
 */
@Configuration
@EnableAuthorizationServer
public class TulingAuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {


    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private PasswordEncoder passwordEncoder;


    /**
     * 认证用户的
     * @param endpoints
     * @throws Exception
     */
    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {

        endpoints.authenticationManager(authenticationManager);
    }

    /**
     * 配置基于数据库存储
     * @param clients
     * @throws Exception
     */
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        /**
         * 配置解析 授权服务器指定客户端(第三方应用)能访问授权服务器
         * 为第三方应用颁发客户端 id为  ,密码为smlz
         * 支持的授权类型为 密码模式(有四种模式,后面说)
         * 颁发的令牌的有效期为1小时
         * 通过该令牌可以访问 哪些资源服务器(order-service) 可以配置多个
         * 访问资源服务器的read write权限
         */

        clients.inMemory()
                .withClient("portal_app")
                .secret(passwordEncoder.encode("portal_app"))
                .authorizedGrantTypes("password")
                .scopes("read")
                .accessTokenValiditySeconds(3600)
                .resourceIds("order-service","product-service")
                .and()
                .withClient("order_app")
                .secret(passwordEncoder.encode("smlz"))
                .accessTokenValiditySeconds(1800)
                .scopes("read")
                .authorizedGrantTypes("password")
                .resourceIds("order-service")
                .and()
                .withClient("product_app")
                .secret(passwordEncoder.encode("smlz"))
                .accessTokenValiditySeconds(1800)
                .scopes("read")
                .authorizedGrantTypes("password")
                .resourceIds("product-service");
    }


    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {
        //获取tokenkey需要登陆
        security.checkTokenAccess("isAuthenticated()");
    }

}
