package br.com.wsp.restkotlin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
@RequestMapping("/teste")
class TesteController {



    val counter: AtomicLong= AtomicLong()
    @GetMapping
    fun teste(): Teste{
        return Teste(counter.incrementAndGet(), "Olá Kotlin")
    }

}