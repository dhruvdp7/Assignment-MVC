# Assignment-MVC
  I have made a simple program to calculate the sum of two numbers using <b>MVC</b> Design pattern.<br><br>
  <hr>
  <h3>There are 4 classes, ie- CaculatorView, CalculatorModel, CalculatorController and a Main class.</h3>
  <ul>
  <li>In <b>CalculatorView</b>, I have used java swings to create a user interface that will ask the user to input two <br>
    numbers and a button that will calculate the result and display on a textbox. </li>
  <li>In <b>CalculatorModel</b>, There are two methods <b>setResult</b> and <b>getResult</b></li>
  <li> <b>CalculatorController</b> class is used for communication between model and view. ie, it will fetch the data from the view and send to the model for calculation and later the result is taken and displayed on the view</li>
  <li><b>Main</b> is used to create objects of Model and view. The reference of model and view is passed as arguements to the object of controller</li></ul>
