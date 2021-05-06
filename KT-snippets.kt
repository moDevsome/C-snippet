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

// Open a file and walk the lines
// A good advice : use "context.filesDir" for storing your file in the application private folder, it's really more appropriate than using a custom path
fileStream = File("/path/to/the/file/folder", "filename");
fileStream.forEachLine { it
    
     // Do something with the line
                                
}
