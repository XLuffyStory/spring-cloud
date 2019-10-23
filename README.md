# spring-cloud

https://stackoverflow.com/questions/31976236/whats-the-difference-between-enableeurekaclient-and-enablediscoveryclient
There are multiple implementations of "Discovery Service" (eureka, consul, zookeeper). 
@EnableDiscoveryClient lives in spring-cloud-commons and picks the implementation on the classpath. 
@EnableEurekaClient lives in spring-cloud-netflix and only works for eureka. 
If eureka is on your classpath, they are effectively the same.
