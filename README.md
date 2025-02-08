<!DOCTYPE html>
<html>
<head>
    <title>Project Documentation</title>
    <style>
        .section { cursor: pointer; font-weight: bold; }
        .content { display: none; margin-left: 20px; }
    </style>
</head>
<body>
    <h1>Project Documentation</h1>
    
    <div class="section" onclick="toggle('intro')">🚀 Introduction</div>
    <div id="intro" class="content">
        <p>This is the introduction section.</p>
    </div>

    <div class="section" onclick="toggle('install')">🛠 Installation</div>
    <div id="install" class="content">
        <p>Follow these steps to install:</p>
        <ol>
            <li>Step 1</li>
            <li>Step 2</li>
            <li>Step 3</li>
        </ol>
    </div>

    <script>
        function toggle(id) {
            var content = document.getElementById(id);
            content.style.display = (content.style.display === "block") ? "none" : "block";
        }
    </script>
</body>
</html>
