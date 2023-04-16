package leivy.stockmarketapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StockmarketappApplication

fun main(args: Array<String>) {
	runApplication<StockmarketappApplication>(*args)
}
