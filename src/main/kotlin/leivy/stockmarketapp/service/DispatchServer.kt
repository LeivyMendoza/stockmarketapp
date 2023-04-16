package leivy.stockmarketapp.service

import org.springframework.stereotype.Service
import org.springframework.kafka.core.KafkaTemplate;

@Service
abstract class DispatchServer {
    abstract val kafkaTemplate: KafkaTemplate<String, String>
    class DispatchServer(val kafkaTemplate: KafkaTemplate<String, String>)
    fun publish(data: String): Unit {
        kafkaTemplate.send("stock-market-data", data)
    }
}