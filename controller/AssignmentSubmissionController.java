//package com.moodle.moodledataSQL.controller;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.moodle.moodledataSQL.models.Department;
//
//@RestController
//public class AssignmentSubmissionController{
//
//	@Autowired
//	private AssignmentFileStorageService assignmentfileStorageService;
//	
////	findbyId   -uuid
////	findbyStudentId   all responses of student    enroll
////	findbyAssignmentId    saare bccho ke
////	findbyBatch   b1
////	findbySubjectID   
//	
//	@GetMapping(path="/findById/{uuid}") // will return list of all assignment of this uuid
//	public @ResponseBody  findDepartmentById(@PathVariable String id){
//		System.out.println("Inside Department Controller");
//		return departmentRepository.findByDepartmentId(id);
//		
//	@GetMapping(path="/findBystudentandassignmentId/{studentId}/{assignmentId}")  // will return list of all assignments submiited by a student of given enrollemt no.
//	public @ResponseBody AssignmentSubmission findBystudentandassignmentId(@PathVariable String studentId, @PathVariable String assignmentId){
//		System.out.println("Inside Department Controller");
//		return departmentRepository.findByDepartmentId(id);
//		
//		
//	@GetMapping(path="/findByAssignmentId")
//	@GetMapping(path="/findByBatchId")  //getting all assignments of a particular batch
//	@GetMapping(path="/findBySubjectId")   //getting all assignment submissions of a particular subject
//}
//
//
//
//@RestController
//public class FileStorageController {
//	
//	@Autowired
//	private FileStorageService fileStorageService;
//	
//	@PostMapping("/uploadFile")
//    public String uploadFile(@RequestParam("file") MultipartFile file) {
//        FileStorage fileName = fileStorageService.storeFile(file);
//
//        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
//            .path("/downloadFile/")
//            .path(fileName.getFileName())
//            .toUriString();
//        
//        return "Success";
//    }
//
//    @PostMapping("/uploadMultipleFiles")
//    public void uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
//        Arrays.asList(files).stream().map((file) -> uploadFile(file));
//    }
//    
//    @GetMapping("/downloadFile/{fileName:.+}")
//    public ResponseEntity < Resource > downloadFile(@PathVariable String fileName, HttpServletRequest request) {
//        // Load file as Resource
//        FileStorage databaseFile = fileStorageService.getFile(fileName);
//
//        return ResponseEntity.ok()
//            .contentType(MediaType.parseMediaType(databaseFile.getFileType()))
//            .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + databaseFile.getFileName() + "\"")
//            .body(new ByteArrayResource(databaseFile.getData()));
//    }
//}
//
//@GetMapping(path="/{id}")
//public @ResponseBody Department findDepartmentById(@PathVariable String id){
//	System.out.println("Inside Department Controller");
//	return departmentRepository.findByDepartmentId(id);
//}
