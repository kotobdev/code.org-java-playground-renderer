# code.org-java-playground-renderer
A small test with lighting in the Code.Org pilot program Java playground (lesson 12)

This is the code used for a light renderer in the Code.Org Java Playground.
if you're able to access it (unlikely), the code is meant for Lesson 12 or 13. Just replace the code in the preexisting files with this, and create new files as needed. 
Example render (5 to 1 resolution):
<div><img align="left" width="300" height="300" src="https://cdn.discordapp.com/attachments/664667250292293654/930627451019747388/unknown.png"></div>

In a nutshell, this code uses ASCII characters to represent pixels, as images (apparently) cannot be manipulated via code in the code.org playground. Text color, however, can. This does have the side effect of creating up to 160000 flexboxes, but... at least it works. 
The code finds the distance from each pixel from a light source, and edits the color accordingly. It does this recursively, looping through each pixel by going through each row. It's not exactly fast, due to this. A 1 to 1 render resolution would take approximately 8 hours to complete. Not to mention it would take your browser a few hours to render every flexbox as well.
