package spring.cloud.stream_example.consumer

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.function.Consumer
import java.util.function.Supplier

@Configuration
class KafkaConfig {
    @Bean
    fun basicProducer(): Supplier<String> {
        println("KafkaConfig.basicProducer")
        return Supplier {
            "Hello from Kafka!"
        }
    }
    @Bean
    fun basicConsumer(): Consumer<String> {
        println("KafkaConfig.basicConsumer")
        return Consumer { message -> println("Received: $message") }
    }
}