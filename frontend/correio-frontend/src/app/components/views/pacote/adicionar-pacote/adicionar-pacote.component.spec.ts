import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdicionarPacoteComponent } from './adicionar-pacote.component';

describe('AdicionarPacoteComponent', () => {
  let component: AdicionarPacoteComponent;
  let fixture: ComponentFixture<AdicionarPacoteComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AdicionarPacoteComponent]
    });
    fixture = TestBed.createComponent(AdicionarPacoteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
