package pl.lodz.p.stanczyk.authgateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

@EnableZuulProxy
@SpringBootApplication
class AuthgatewayApplication

fun main(args: Array<String>) {
	runApplication<AuthgatewayApplication>(*args)
}
