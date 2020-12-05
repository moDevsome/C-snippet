// Show an alert box on Android app
val alertBox = AlertDialog.Builder(this);
alertBox.setTitle( "App is closing" );
alertBox.setMessage( "Bye bye" );
alertBox.show();

// Handle button click
val closeButton: Button = findViewById(R.id.close_button);
closeButton.setOnClickListener {

    Log.i("DEBUG","Clique sur le bouton QUITTER");
    this.sayBye();

}
