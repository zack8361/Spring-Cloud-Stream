package spring.cloud.stream_example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StreamExampleApplication

fun main(args: Array<String>) {
	runApplication<StreamExampleApplication>(*args)
}
