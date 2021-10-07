<h1>Adicionar Biblioteca</h1>

<p>Esta biblioteca é privada e portanto para incluí-la é necessário efetuar a inclusão com um token do github</p>

<ol>
<li>Crie um arquivo github.properties e insira as credencias conforme abaixo:</li>

```
  gpr.usr=user_github
  gpr.key=seu_token_aqui
```

<li>No arquivo settings.gradle, insira o repositório conforme abaixo: </li>

```

  repositories {
        maven{
            def gitHubProperties = new Properties()
            gitHubProperties.load(new FileInputStream("github.properties"))
            url = uri("https://maven.pkg.github.com/f4biofish/library_yts")
            credentials {
                username = gitHubProperties['gpr.usr']
                password = gitHubProperties['gpr.key']
            }
        }
    }

```

<li>Por fim, inclua a implementação do repositório no arquivo buid.gradle</li>

```

implementation 'br.com.fish:library_yts:1.0'

```

</ol>
