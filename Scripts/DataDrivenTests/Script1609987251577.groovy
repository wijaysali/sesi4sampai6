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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

        //tipe-data=int ; source data[dapatkan data berdasarkan (jumlah) baris; 
for(def rowNum=1; rowNum <= findTestData("Data/data1").getRowNumbers(); rowNum++)
{
//WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), Username)
WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), findTestData('Data/data1').getValue(1, rowNum))


//WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_txtPassword'), Password)
WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_txtPassword'), findTestData('Data/data1').getValue(2, rowNum))

Thread.sleep(3000)
}

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Password_Submit'))

WebUI.closeBrowser()

