package com.kh.spring22.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring22.entity.PocketMonsterDto;
import com.kh.spring22.repository.PocketMonsterDao;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/rest")
@CrossOrigin(origins = "http://192.168.130.183:5501")
public class PocketmonController {
   
   @Autowired
   private PocketMonsterDao dao;
   
   @Operation(
			summary = "포켓몬 목록", 
			description = "포켓몬 목록",
			responses = {
				@ApiResponse(
					responseCode = "200", 
					content = @Content(
						mediaType = "application/json",
						array = @ArraySchema(schema = @Schema(implementation = PocketMonsterDto.class))
					)
				),
				@ApiResponse(
					responseCode = "500", 
					content = @Content(
						mediaType = "text/plain",
						schema = @Schema(implementation = String.class),
						examples = {
							@ExampleObject(value="server error")
						}
					)
				)
			}
		)
   
   @GetMapping("/pocketmon")
   public List<PocketMonsterDto> list() {
      return dao.list();
   }
   @Operation(
			summary = "포켓몬 상세", 
			description = "포켓몬 상세",
			responses = {
				@ApiResponse(
					responseCode = "200", 
					content = @Content(
						mediaType = "application/json",
						array = @ArraySchema(
							schema = @Schema(
								implementation = PocketMonsterDto.class
							)
						)
					)
				),
				@ApiResponse(
					responseCode = "404", 
					content = @Content(
						mediaType = "text/plain",
						schema = @Schema(implementation = String.class),
						examples = {
							@ExampleObject(value="not found")
						}
					)
				),
				@ApiResponse(
					responseCode = "500", 
					content = @Content(
						mediaType = "text/plain",
						schema = @Schema(implementation = String.class),
						examples = {
							@ExampleObject(value="server error")
						}
					)
				)
			}
		)
   
   @GetMapping("pocketmon/{no}")
   public PocketMonsterDto find(@PathVariable int no) {
	   return dao.find(no);
   }
   
   @Operation(
			description = "포켓몬 등록",
			responses = {
				@ApiResponse(responseCode = "200"),
				@ApiResponse(
					responseCode = "500", 
					content = @Content(
						mediaType = "text/plain",
						schema = @Schema(implementation = String.class),
						examples = {
							@ExampleObject(value="server error")
						}
					)
				)
			}
		)
   
   @PostMapping("/pocketmon")
   public void insert(@RequestBody PocketMonsterDto dto) {
	   dao.insert(dto);
   }
   
   @Operation(
			description = "포켓몬 수정",
			responses = {
				@ApiResponse(
					responseCode = "200", 
					content = @Content(
						mediaType = "text/plain",
						schema = @Schema(implementation = Boolean.class),
						examples = {
							@ExampleObject(value = "true")
						}
					)
				),
				@ApiResponse(
					responseCode = "404", 
					content = @Content(
						mediaType = "text/plain",
						schema = @Schema(implementation = String.class),
						examples = {
							@ExampleObject(value="not found")
						}
					)
				),
				@ApiResponse(
					responseCode = "500", 
					content = @Content(
						mediaType = "text/plain",
						schema = @Schema(implementation = String.class),
						examples = {
							@ExampleObject(value="server error")
						}
					)
				)
			}
		)
   
//   PUT 방식은 POST 처럼 데이터를 Body에 전송할 수 있는 방식
   @PutMapping("/pocketmon")
   public boolean edit(@RequestBody PocketMonsterDto dto) {
	   return dao.edit(dto);
   }
   
   @Operation(
			description = "포켓몬 삭제",
			responses = {
				@ApiResponse(
					responseCode = "200", 
					content = @Content(
						mediaType = "text/plain",
						schema = @Schema(implementation = Boolean.class),
						examples = {
							@ExampleObject(value = "true")
						}
					)
				),
				@ApiResponse(
					responseCode = "404", 
					content = @Content(
						mediaType = "text/plain",
						schema = @Schema(implementation = String.class),
						examples = {
							@ExampleObject(value="not found")
						}
					)
				),
				@ApiResponse(
					responseCode = "500", 
					content = @Content(
						mediaType = "text/plain",
						schema = @Schema(implementation = String.class),
						examples = {
							@ExampleObject(value="server error")
						}
					)
				)
			}
		)
   
   @DeleteMapping("/pocketmon/{no}")
   public boolean delete(@PathVariable int no) {
	   return dao.delete(no);
   }
}









