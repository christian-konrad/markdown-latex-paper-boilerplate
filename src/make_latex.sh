pandoc --filter pandoc-citeproc -V papersize=a4paper -V breakurl -V hyphens=URL -V breakurl=true -V link-citations=true --highlight-style tango -s *.md -t latex -o ../out/essay.tex
