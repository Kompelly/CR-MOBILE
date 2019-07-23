import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Object Repository/sample/Mega menu/a_Shoes'))

WebUI.click(findTestObject('Object Repository/sample/Mega menu/sneakers'))

WebUI.click(findTestObject('Collection page/product 3'))

WebUI.click(findTestObject('product page/White color variant'))

WebUI.click(findTestObject('product page/Size -6'))

WebUI.click(findTestObject('product page/span_Add to Bag (2)'))

WebUI.click(findTestObject('Cart flyout/div_Find a Store_cart__backdro'))

WebUI.click(findTestObject('product page/size -7'))

WebUI.click(findTestObject('product page/span_Add to Bag (2)'))

WebUI.click(findTestObject('Cart flyout/div_Find a Store_cart__backdro'))

WebUI.click(findTestObject('Object Repository/sample/Mega menu/a_Jeans'))

WebUI.click(findTestObject('Object Repository/sample/Mega menu/Boy friend jeans'))

WebUI.click(findTestObject('Collection page/Product 2'))

WebUI.click(findTestObject('product page/size -18'))

WebUI.click(findTestObject('product page/span_Add to Bag (1)'))

WebUI.click(findTestObject('Cart flyout/cart collpase'))

WebUI.click(findTestObject('product page/size -20'))

WebUI.click(findTestObject('product page/span_Add to Bag (1)'))

WebUI.click(findTestObject('Cart flyout/cart collpase'))

WebUI.click(findTestObject('Object Repository/sample/Mega menu/a_Accessories'))

WebUI.click(findTestObject('Object Repository/sample/Mega menu/Scarves'))

WebUI.click(findTestObject('Collection page/product 1'))

WebUI.click(findTestObject('product page/Size - one size'))

WebUI.click(findTestObject('product page/Add to bag'))

WebUI.click(findTestObject('Cart flyout/Checkout'))

WebUI.setText(findTestObject('Customer info page/Email'), 'suman@gmail.com')

WebUI.setText(findTestObject('Customer info page/First name'), 'suman')

WebUI.setText(findTestObject('Customer info page/Last name'), 'kompelly')

WebUI.setText(findTestObject('Customer info page/Address'), '123 saint alxendre')

WebUI.setText(findTestObject('Customer info page/apt suite'), '199')

WebUI.setText(findTestObject('Customer info page/City'), 'montreal')

WebUI.selectOptionByValue(findTestObject('Customer info page/state dropdown'), 'NJ', true)

WebUI.setText(findTestObject('Customer info page/Zip code'), '07057')

WebUI.click(findTestObject('Customer info page/Continue to shipping'))

WebUI.click(findTestObject('Payment page/Continue to payment'))

WebUI.openBrowser('')

WebUI.click(findTestObject('Cart flyout/cart quantity increase - cart flyout'))

WebUI.setText(findTestObject('Cart flyout/Input update - cart flyout'), '4')

WebUI.click(findTestObject('Cart flyout/click outside'))

WebUI.click(findTestObject('Cart flyout/click outside'))

WebUI.click(findTestObject('Page_High Top Slip On Sneaker  Char/span_14.99'))

WebUI.click(findTestObject('Page_High Top Slip On Sneaker  Char/div_21.94'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://charlotterusse.com/')

WebUI.setText(findTestObject('Cart page/input update qunatity'), '4')

WebUI.click(findTestObject('Cart page/td_Quantity'))

WebUI.setText(findTestObject('Cart page/input update qunatity'), '6')

WebUI.click(findTestObject('Cart page/td_Quantity'))

WebUI.click(findTestObject('CR-DESKTOP/Cart page/Get price - subtotal - cart page'))

WebUI.click(findTestObject('Cart page/Update cart'))

WebUI.click(findTestObject('Cart page/Check out - cart page'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://charlotterusse.com/')

WebUI.click(findTestObject('Add prod - home page/Hero banner - 1 st'))

WebUI.click(findTestObject('Add prod - home page/1 st product'))

WebUI.click(findTestObject('Add prod - home page/Black variant'))

WebUI.click(findTestObject('Add prod - home page/Size - SP'))

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Page_Pleated Cropped Pant  Charlott/span_Add to Bag'))

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Page_Pleated Cropped Pant  Charlott/div_Find a Store_cart__backdro'))

WebUI.click(findTestObject('Add prod - home page/Charlotte russe icon'))

WebUI.click(findTestObject('Add prod - home page/Hero banner - 2nd'))

WebUI.click(findTestObject('Add prod - home page/2 nd product'))

WebUI.click(findTestObject('Add prod - home page/Size - 16'))

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Page_Refuge Plus Size High-Rise Dar/span_Add to Bag'))

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Page_Refuge Plus Size High-Rise Dar/div_Find a Store_cart__backdro'))

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Page_Refuge Plus Size High-Rise Dar/img_Skip to content_header-log'))

WebUI.click(findTestObject('Add prod - home page/middle tile - home page'))

WebUI.click(findTestObject('Add prod - home page/3 rd product'))

WebUI.click(findTestObject('Add prod - home page/Neon orange varaint'))

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Page_Neon Side Stripe Cropped Hoode/label_SP'))

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Page_Neon Side Stripe Cropped Hoode/span_Add to Bag'))

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Page_Neon Side Stripe Cropped Hoode/div_Find a Store_cart__backdro'))

WebUI.click(findTestObject('CR-DESKTOP/Home page/Add prod - home page/Page_Neon Side Stripe Cropped Hoode/img_Skip to content_header-log'))

WebUI.openBrowser('')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://charlotterusse.com/')

WebUI.setText(findTestObject('Page_Charlotte Russe/input_Shop All_q'), 'heels')

WebUI.sendKeys(findTestObject('Page_Charlotte Russe/input_Shop All_q'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/sample/Page_heels taglanguage_en  Charlott/img_NEXT_featured_collection__'))

WebUI.click(findTestObject('Object Repository/sample/Page_Stiletto Heel Pump  Charlotte/label_Black_product__radio rad'))

WebUI.click(findTestObject('Object Repository/sample/Page_Stiletto Heel Pump  Charlotte/label_7'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://charlotterusse.com/')

WebUI.click(findTestObject('Object Repository/sample/Store Locator/Results total list'))

WebUI.setText(findTestObject('Object Repository/sample/Store Locator/Search input'), '49418')

WebUI.click(findTestObject('Object Repository/sample/Store Locator/Results list after'))

WebUI.click(findTestObject('Object Repository/sample/Store Locator/Distance filter'))

WebUI.click(findTestObject('Object Repository/sample/Store Locator/Filter'))

WebUI.click(findTestObject('Object Repository/sample/Store Locator/button_Filter'))

WebUI.click(findTestObject('Object Repository/sample/Store Locator/Label - until 9pm'))

WebUI.click(findTestObject('Object Repository/sample/Store Locator/Results list after filter'))

WebUI.click(findTestObject('Object Repository/sample/Store Locator/Clear filter'))

WebUI.click(findTestObject('Object Repository/sample/Store Locator/Next button'))

WebUI.click(findTestObject('Object Repository/sample/Store Locator/Prev - button'))

WebUI.selectOptionByValue(findTestObject('Object Repository/sample/Store Locator/select dropdown'), '2', true)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://charlotterusse.com/')

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/a_Contact Us'))

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/a_Track Order'))

WebUI.click(findTestObject('Object Repository/sample/Page_Account  Charlotte Russe/a_Shipping Info'))

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/a_Return Policy'))

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/a_About Us'))

WebUI.click(findTestObject('Object Repository/sample/Page_About Us  Charlotte Russe/a_Careers'))

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/a_Terms  Conditions'))

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/a_Privacy Policy'))

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/a_Social Media Policy'))

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/a_FAQs'))

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/a_Size Chart'))

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/a_Find a Store'))

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/Facebook'))

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/twitter'))

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/Instagram'))

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/Pintrest'))

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/youtube'))

WebUI.setText(findTestObject('CR-DESKTOP/Home page/Footer/Input'), 
    'suman@gmail.com')

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/button_Sign Up'))

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/div_Thank you for subscribing'))

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/Contact us'))

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/Track package'))

WebUI.click(findTestObject('CR-DESKTOP/Home page/Footer/Store locator'))

