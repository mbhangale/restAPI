package com.mayuresh.restAPI.config;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Paths;
import io.swagger.v3.oas.models.servers.Server;
import springfox.documentation.oas.web.OpenApiTransformationContext;
import springfox.documentation.oas.web.WebMvcOpenApiTransformationFilter;
import springfox.documentation.spi.DocumentationType;

public class SwaggerConfig implements WebMvcOpenApiTransformationFilter {

	@Value("${server.servlet.contextPath}")
	String applicationName;
	
	@Override
	public OpenAPI transform(OpenApiTransformationContext<HttpServletRequest> context) {
		OpenAPI openApi = context.getSpecification();
		Server server = new Server();
		server.setUrl(openApi.getServers().get(0).getUrl() + applicationName);
		openApi.setServers(Arrays.asList(server));
		openApi.setPaths(getEndpointPath(openApi));
		return openApi;
	}

	private Paths getEndpointPath(OpenAPI openApi) {
		Paths paths = new Paths();
		openApi.getPaths().entrySet().forEach(e -> {
			paths.addPathItem(contructPath(e.getKey()), e.getValue());
		});
		return null;
	}

	private String contructPath(String path) {
		return StringUtils.removeStart(path, applicationName);
	}

	@Override
	public boolean supports(DocumentationType delimiter) {
		// TODO Auto-generated method stub
		return true;
	}

}
