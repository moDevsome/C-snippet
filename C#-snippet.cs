//*** Create a GUI window that fill all the screen ***//
Form mainWindow = new Form();
mainWindow.WindowState = FormWindowState.Maximized;

//*** Set a custom position and size for a GUI window ***//
Form mainWindow = new Form();
mainWindow.Size = new Size(1400, 1050);
mainWindow.StartPosition = FormStartPosition.Manual;
mainWindow.DesktopLocation = new Point(0, 0);

//*** Recursive directory walking ***//
String[] extensions_filters = {".php",".css",".scss",".js",".json",".html",".txt",".sql"};
List<String> extensions = new List<String>();
extensions.AddRange( extensions_filters );
foreach(String File_path in Directory.GetFiles(path, "*.*", SearchOption.AllDirectories)) {

    if(extensions.Contains(Path.GetExtension(File_path))) {

        Console.WriteLine(File_path);

    }

}
