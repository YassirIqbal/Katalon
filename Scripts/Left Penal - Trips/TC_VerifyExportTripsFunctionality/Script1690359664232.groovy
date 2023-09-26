import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Windows.startApplicationWithTitle('C:\\Program Files\\Quixel Tracker staging3\\Quixel Tracker staging3.exe', 'Quixel Tracker staging3')

Thread.sleep(5000)

Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/ExportTrips/ExportButton'))

Thread.sleep(5000)

Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/ExportTrips/DesktopPath'))

Thread.sleep(5000)

Windows.click(findWindowsObject('Object Repository/Left Penal - Trips/ExportTrips/SaveButton'))

Thread.sleep(5000)

def downloadPath = "C://Users//Quixel//Desktop" // replace with your desired download path

// verify that the file is downloaded successfully
def file = new File(downloadPath + "\\Trips.csv")
assert file.exists()

// verify the name of the downloaded file
assert file.getName() == "Trips.csv"