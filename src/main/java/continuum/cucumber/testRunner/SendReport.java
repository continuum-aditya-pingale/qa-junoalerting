/*
 * package continuum.cucumber.testRunner;
 * 
 * import java.io.File; import java.io.FileInputStream; import
 * java.io.IOException; import java.io.StringWriter;
 * 
 * import java.util.Date; import java.util.Properties;
 * 
 * import javax.activation.DataHandler; import javax.activation.DataSource;
 * import javax.activation.FileDataSource; import javax.mail.BodyPart; import
 * javax.mail.Message; import javax.mail.MessagingException; import
 * javax.mail.Multipart; import javax.mail.PasswordAuthentication; import
 * javax.mail.Session; import javax.mail.Transport; import
 * javax.mail.internet.InternetAddress; import javax.mail.internet.MimeBodyPart;
 * import javax.mail.internet.MimeMessage; import
 * javax.mail.internet.MimeMultipart;
 * 
 * import org.apache.commons.io.IOUtils; import org.json.simple.JSONObject;
 * 
 * import continuum.cucumber.Utilities; import
 * continuum.cucumber.reporting.Artifactory;
 * 
 * public class SendReport {
 * 
 * public static String buildNo;
 * 
 *//**
	 * @param userName
	 * @param password
	 * @param reciever
	 * @param subject
	 * @param message
	 * @param report   sending email
	 *//*
		 * public static void sendEmailWithAttachment(final String userName, final
		 * String password, String reciever, String subject, String message, File
		 * report) { try { // sets SMTP server properties Properties properties = new
		 * Properties(); properties.setProperty("mail.smtp.host",
		 * Utilities.getMavenProperties("emailHost"));
		 * properties.setProperty("mail.smtp.port",
		 * Utilities.getMavenProperties("emailHost"));
		 * properties.setProperty("mail.smtp.auth", "true");
		 * 
		 * properties.setProperty("mail.smtp.starttls.enable", "true");
		 * 
		 * properties.put("mail.smtp.auth", "true");
		 * properties.put("mail.smtp.starttls.enable", "true");
		 * properties.put("mail.smtp.host", Utilities.getMavenProperties("emailHost"));
		 * properties.put("mail.smtp.port", Utilities.getMavenProperties("emailPort"));
		 * 
		 * Session session = Session.getInstance(properties, new
		 * javax.mail.Authenticator() { protected PasswordAuthentication
		 * getPasswordAuthentication() { return new PasswordAuthentication(userName,
		 * password); } });
		 * 
		 * Session session = Session.getDefaultInstance(properties, new
		 * javax.mail.Authenticator() { protected PasswordAuthentication
		 * getPasswordAuthentication() { return new
		 * PasswordAuthentication(userName,password); } });
		 * 
		 * // creates a new e-mail message MimeMessage msg = new MimeMessage(session);
		 * 
		 * msg.setFrom(new InternetAddress(userName));
		 * 
		 * msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(reciever));
		 * 
		 * msg.setSubject(subject); msg.setSentDate(new Date());
		 * 
		 * 
		 * //New Code Added in reporting String absolutePath = new
		 * File("").getAbsolutePath(); String attachFiles=absolutePath+
		 * "\\target\\surefire-reports\\Cucumber-Report\\Juno-Alerting-AutomationReport.html";
		 * 
		 * System.out.println("File Path : " +absolutePath);
		 * 
		 * try { // Create the message part System.out.println("Create Message Part");
		 * BodyPart messageBodyPart = new MimeBodyPart();
		 * 
		 * // Now set the actual message //
		 * messageBodyPart.setText("This is message body"); //
		 * messageBodyPart.setText(+addReportBody); StringWriter writer = new
		 * StringWriter(); try { System.out.println("Now set the actual message");
		 * IOUtils.copy(new FileInputStream(report), writer);
		 * messageBodyPart.setContent(writer.toString(), "text/html"); } catch
		 * (IOException e) {
		 * System.out.println("Not able to retrive cucumber report file");
		 * e.printStackTrace(); }
		 * 
		 * // Create a multipar message Multipart multipart = new MimeMultipart();
		 * 
		 * // Set text message part multipart.addBodyPart(messageBodyPart);
		 * 
		 * // Part two is attachment messageBodyPart = new MimeBodyPart();
		 * 
		 * DataSource source = new FileDataSource(attachFiles);
		 * messageBodyPart.setDataHandler(new DataHandler(source));
		 * messageBodyPart.setFileName("Juno-Alerting-AutomationReport.html");
		 * multipart.addBodyPart(messageBodyPart);
		 * 
		 * // Send the complete message parts msg.setContent(multipart);
		 * 
		 * // Send message Transport.send(msg);
		 * 
		 * System.out.println("Sent message successfully....");
		 * 
		 * } catch (MessagingException e) { throw new RuntimeException(e); }
		 * 
		 * System.out.println("********Sending report mail**********");
		 * 
		 * } catch (MessagingException e) {
		 * System.out.println("****************Unable to Send Email : " +
		 * e.getMessage()); } }
		 * 
		 * public static void sendReportWithMail(String folderName) { String
		 * absolutePath = new File("").getAbsolutePath(); if
		 * (Utilities.getMavenProperties("reportMail").equalsIgnoreCase("true")) {
		 * String sender = Utilities.getMavenProperties("reportUser"); //JSONObject
		 * buildNumberInfo = Artifactory.getLatestBuildNumberOfRespository(); String
		 * subject; if (buildNumberInfo == null || buildNumberInfo.isEmpty() ||
		 * buildNumberInfo.size() < 0) { subject = "Automation Report for " +
		 * Utilities.getMavenProperties("ProjectName"); } else { subject =
		 * "Automation Report for " + Utilities.getMavenProperties("ProjectName") +
		 * " on " + Artifactory.formTheBuildVersionsForReporting(Artifactory.
		 * getLatestBuildNumberOfRespository()); }
		 * 
		 * subject = Utilities.getMavenProperties("Environment") +
		 * " Environment : Automation Report for " +
		 * Utilities.getMavenProperties("ProjectName") + " on " + buildNo;
		 * 
		 * String message = "Automation Report for " +
		 * Utilities.getMavenProperties("ProjectName"); if
		 * (Utilities.getMavenProperties("ProjectName").equalsIgnoreCase(
		 * "Platform-Alerting")) { message = message +
		 * "\n For more details, Visit:  http://qedashboard.continuum.net/qemetrics/status.php"
		 * ; }
		 * 
		 * String password = Utilities.getMavenProperties("reportPassword"); File
		 * cucumberReport = new File( absolutePath +
		 * "\\" + folderName + "\\" + "index.html"); String reciever =
		 * Utilities.getMavenProperties("reportReciever");
		 * sendEmailWithAttachment(sender, password, reciever, subject, message,
		 * cucumberReport); } }
		 * 
		 * }
		 */