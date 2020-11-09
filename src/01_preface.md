---
title: YOUR TITLE HERE\vspace{2ex}
subtitle: > 
    SUBTITLE HERE\vspace{1ex}
date: DATE HERE\vspace{4ex}
author: 
    - AUTHOR ONE
    - AUTHOR TWO
institute: YOUR INSTITUTE
header-includes: |    
    \usepackage[utf8]{inputenc}
    \usepackage[english]{babel}    
    \usepackage{amsmath}
    \usepackage{amsthm}
    \usepackage[backend=bibtex,style=numeric]{biblatex}
    \usepackage{graphicx}    
    \usepackage{fancyhdr}
    \pagestyle{fancy}
    \fancyhead{}
    \fancyfoot{}
    \fancyhead[LE,RO]{<YOUR TITLE HERE> \hfill \thepage}
    \renewcommand{\headrulewidth}{0pt}    
    \usepackage{tikz}
    \usetikzlibrary{shapes,arrows,positioning,calc,fit,babel}
    \usepackage{adjustbox}
    \usepackage{tikzpeople}
    \usepackage{pifont,mdframed}
    \usepackage{listings}
    \usepackage{lmodern}
    \usepackage{xcolor}
    \usepackage{boxedminipage}
    \usepackage{needspace}
    \usepackage[font={small},justification=centering]{caption}
    \lstset{
      columns=fullflexible,
      frame=single,
      breaklines=true,
      postbreak=\mbox{\textcolor{red}{$\hookrightarrow$}\space},
      numbers=left,
      numberstyle=\tiny\color{gray},
      keywordstyle=\color[RGB]{40,40,255},
      basicstyle=\ttfamily\small,
      numberstyle=\footnotesize\color{darkgray},
      commentstyle=\it\color[RGB]{0,96,96},
      stringstyle=\slshape\color[RGB]{128,0,0},
      showstringspaces=false,
      aboveskip=20pt,
      belowskip=20pt,
      language=java
    }
    \newenvironment{warning}
      {\par\begin{mdframed}[linewidth=1pt,linecolor=red]%
        \begin{list}{}{\leftmargin=1cm
          \labelwidth=\leftmargin}\item[\Large\ding{43}]}
      {\end{list}\end{mdframed}\par}
bibliography: [citations.bib]
csl: [ieee.csl]    
classoption: [symmetric]
documentclass: article
link-citations: true
numbersections: true
secnumdepth: 2
indent: true
hyperrefoptions:
- breaklinks
abstract: |
    <YOUR ABSTRACT HERE>
    Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.
---
