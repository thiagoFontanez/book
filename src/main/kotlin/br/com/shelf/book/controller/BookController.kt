package br.com.shelf.book.controller

import java.io.File
import java.lang.System.`in`
import java.util.Scanner

import org.springframework.web.bind.annotation.*
import br.com.shelf.book.model.*
 

@RestController
@RequestMapping("/book")
class BookController {

fun readFile(): List<BookModel>{
	println("iniciando Leitura ")
	val listBooks = mutableListOf<BookModel>()
    val file = File("books.txt")
    val input = Scanner(`in`)
    file.forEachLine {
        if (it.isNotEmpty()) {
            val info = it.split(";;")
            val book = BookModel(title = info[0], author = info[1], synopsis = info[2])
            listBooks.add(book)
        }
    }
     
    println("arquivos lidos com sucesso ")
    input.close()
    return  listBooks;
}
	
	@GetMapping
	fun listAllBooks():List<BookModel> = readFile()
	
	@GetMapping("/find")
	@ResponseBody
	fun findBook(@RequestParam book: String): BookModel{
		val books = readFile()
		val index = books.indexOfFirst{ it.title == book}
		if(index >=0){
			return books[index]
		}
		return BookModel(title = "nao encontrado", author = "nao encontrado", synopsis = "nao encontrado")
	}
		
}