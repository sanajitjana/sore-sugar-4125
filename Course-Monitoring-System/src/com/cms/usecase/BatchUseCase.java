//package com.cms.usecase;
//
//import java.util.InputMismatchException;
//import java.util.List;
//import java.util.Scanner;
//
//import com.cms.bean.Batch;
//import com.cms.dao.BatchDao;
//import com.cms.dao.BatchDaoImp;
//import com.cms.exceptions.BatchException;
//import com.cms.start.UserActivity;
//
//public class BatchUseCase {
//
//	public static void courseBatch() {
//
//		BatchDao dao = new BatchDaoImp();
//		Batch batch = new Batch();
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter batch details - ");
//
//		try {
//
//			String name = null;
//			try {
//
//				System.out.println("Enter batch name");
//				name = sc.next();
//
//				boolean res = dao.isBatchNameUnique(name);
//
//				if (res) {
//					System.out.println("\nThis batch not already exists!");
//
//					System.out.println("\nTry again...");
//					UserActivity.batchOptions();
//				}
//
//			} catch (BatchException e1) {
//				// TODO Auto-generated catch block
//				System.out.println(e1.getMessage());
//			}
//
//			int courseId = 0;
//			try {
//
//				System.out.println("Enter course Id");
//				courseId = sc.nextInt();
//
//				boolean res = dao.isCourseIdPresent(courseId);
//
//				if (res) {
//					System.out.println("\nThis course Id doesn't exists!");
//
//					System.out.println("\nTry again...");
//					UserActivity.batchOptions();
//				}
//
//			} catch (BatchException e1) {
//				// TODO Auto-generated catch block
//				System.out.println(e1.getMessage());
//			}
//
//			int facultyId = 0;
//			try {
//
//				System.out.println("Enter faculty Id");
//				facultyId = sc.nextInt();
//
//				boolean res = dao.isFacultyIdPresent(facultyId);
//
//				if (res) {
//					System.out.println("\nThis faculty Id doesn't exists!");
//
//					System.out.println("\nTry again...");
//					UserActivity.batchOptions();
//				}
//
//			} catch (BatchException e1) {
//				// TODO Auto-generated catch block
//				System.out.println(e1.getMessage());
//			}
//
//			System.out.println("Enter no of students");
//			int numberOfStudents = sc.nextInt();
//
//			System.out.println("Enter batch start-date (yyyy-mm-dd)");
//			String batchStartDate = sc.next();
//
//			System.out.println("Enter duration of the batch");
//			String duration = sc.next();
//
//			batch.setBatchName(name);
//			batch.setCourseId(courseId);
//			batch.setFacultyId(facultyId);
//			batch.setNumberOfStudents(numberOfStudents);
//			batch.setBatchStartDate(batchStartDate);
//			batch.setDuration(duration);
//
//		} catch (InputMismatchException e) {
//			// TODO Auto-generated catch block
//
//			System.out.println("\nInvalid data-type!");
//
//			System.out.println("\nTry again...");
//			UserActivity.batchOptions();
//		}
//
//		try {
//			String result = dao.createBatch(batch);
//			System.out.println("\n" + result);
//
//		} catch (BatchException e) {
//			// TODO Auto-generated catch block
//
//			System.out.println("\n" + e.getMessage());
//
//			System.out.println("\nTry again...");
//			UserActivity.batchOptions();
//
//		}
//
//		UserActivity.batchOptions();
//
//	}
//
//	public static void courseUpdateByName() {
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("\nEnter batch name to update - ");
//
//		System.out.println("Enter old batch name");
//		String old_name = sc.next();
//
//		System.out.println("Enter new batch name");
//		String new_name = sc.next();
//
//		int fee = 0;
//		try {
//
//			System.out.println("Enter new fee");
//			fee = sc.nextInt();
//
//		} catch (InputMismatchException e) {
//			// TODO Auto-generated catch block
//
//			System.out.println("\nBatch fee is numeric!");
//
//			System.out.println("\nTry again...");
//			UserActivity.batchOptions();
//		}
//
//		System.out.println("Enter new description");
//		String description = sc.next();
//
//		BatchDao dao = new BatchDaoImp();
//		Batch batch = new Batch();
//
////		batch.setCourseName(new_name);
////		batch.setFee(fee);
////		batch.setCourseDescription(description);
////
////		String result;
////		try {
////			result = dao.upadteCourseByName(old_name, batch);
////			System.out.println("\n" + result);
////
////		} catch (BatchException e) {
////			// TODO Auto-generated catch block
////
////			System.out.println(e.getMessage());
////
////			System.out.println();
////			System.out.println("Try again...");
////			UserActivity.batchOptions();
////		}
////
////		UserActivity.batchOptions();
//
//	}
//
//	public static void batchViewAll() {
//
//		try {
//
//			List<Batch> batches = new BatchDaoImp().viewAllBatchDetails();
//
//			batches.forEach(c -> {
//
//				System.out.println("Batch ID : " + c.getBatchId());
//				System.out.println("batch Name : " + c.getBatchName());
//				System.out.println("Batch Address : " + c.getFee());
//				System.out.println("Batch Description : " + c.getBatchDescription());
//
//				System.out.println("==================================");
//			});
//
//		} catch (BatchException e) {
//			System.out.println(e.getMessage());
//
//			System.out.println();
//			System.out.println("Try again...");
//			UserActivity.batchOptions();
//
//		}
//
//		UserActivity.batchOptions();
//
//	}
//
//	public static void batchDeleteByName() {
//
//		try {
//
//			String response = new BatchDaoImp().batchDeleteByName();
//			System.out.println("\n" + response);
//
//		} catch (BatchException e) {
//			System.out.println(e.getMessage());
//
//			System.out.println();
//			System.out.println("Try again...");
//			UserActivity.batchOptions();
//
//		}
//
//		UserActivity.batchOptions();
//
//	}
//
//}
